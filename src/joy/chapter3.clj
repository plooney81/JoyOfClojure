(ns joy.chapter3
  (:gen-class))

(def frame (java.awt.Frame.))

(-> frame (.setVisible true))

(-> frame (.setSize (java.awt.Dimension. 300 300)))

(def gfx (.getGraphics frame))

(def fib-seq-seq
  ((fn fib [a b]
     (lazy-seq (cons a (fib b (+ a b)))))
   0 1))

(defn xors [xs ys]
  (for [x (range xs) y (range ys)]
    [x y (rem (bit-xor x y) 256)]))

(defn fib-cords [x y]
  (for [x (take x fib-seq-seq) y (take y fib-seq-seq)]
    [x y (rem (bit-xor x y) 256)]))

(defn f-values [f xs ys]
  (for [x (range xs) y (range ys)]
    [x y (rem (f x y) 256)]))

(defn fib-values [f x y]
  (for [x (take x fib-seq-seq) y (take y fib-seq-seq)]
    [x y (rem (f x y) 256)]))

(defn clear [g] (.clearRect g 0 0 300 300))

(defn draw-values [f xs ys]
  (clear gfx)
  (.setSize frame (java.awt.Dimension. 200 200))
  (doseq [[x y v] (fib-values f xs ys)]
    (.setColor gfx (java.awt.Color. v v v))
    (.fillRect gfx x y 1 1)))
(draw-values + 18 18)