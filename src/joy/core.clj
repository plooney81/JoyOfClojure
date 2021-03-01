(ns joy.core
  (:gen-class))

(defn lists
  "Lists are pretty important in Clojure..."
  []
  ;* This is a list whose first item is a function called println and second item (which is passed as a parameter to the println function) is a string
  (println "lists:\n(func param1 param2 param3)")

  ;* empty list is not nil
  (println (nil? ())) ;? False
  )

(defn vectors
  "Vectors: series of values"
  []
  ;* They use square brackets (like ^)
  (println [1 2 :a :b :c])

  ;* They can have lists inside of them, evaluate each item in order
  (println [1 2 (+ 1 3) :a :b :c])
  
  ;* Access items in an vector using the get keyword
  (println (get [1 2 3 4] 3)) ;? 4

  ;* empty vector isn't nil
  (println (nil? [])) ;? False
  )

(defn maps
  "Maps: Store unique keys and have one value per key...think dictionaries"
  []
  ;* Have a literal syntax with alternating key and values pairs inside of curly braces
  (println {1 "one", 2 "two", 3 "three"})

  ;* Access using the get keyword
  (println (get {1 "one", 2 "two", 3 "three"} 1)) ;? "one"

  ;* An empty map isn't nil
  (println (nil? {})) ;? False
  )

(defn sets
  "Store unique items, written using curly braces with a leading pound sign"
  []
  ;* Key word here is unique
  (println #{1 2 "three" :four 0x5})
  
  ;* Again, an empty set is not nil
  (println (nil? #{})) ;=> false
  )

(defn collections
  "Highlights different collecitons in the clojure language: including Lists, Vectors, Maps, and Sets"
  []
  (lists)
  (vectors)
  (maps)
  (sets))

(defn -main
  "Calls other functions that each highlight a new peice of material while working through the book \"The Joy of Clojure\""
  [& args]
  (collections))