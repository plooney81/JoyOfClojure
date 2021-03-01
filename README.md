# Joy

* This repo houses code written while working through the book "The Joy of Clojure" by Micael Fogus and Chris Houser.
* If you are interested in their book, you can find it [here](https://www.manning.com/books/the-joy-of-clojure-second-edition)

## From the Beginning

* Started off learning about different types of collections, including Lists (which you know are pretty important in Lisp), Vectors, Maps, and Sets.

### Lessons Learned

* Clojure does not consider any empty collection to be nil
```clojure
;List
(nil? ()) ;=> false
; Vector
(nil? []) ;=> false
; Map
(nil? {}) ;=> false
; Set
(nil? #{}) ;=> false
```

<!-- FIXME: description

## Installation

Download from http://example.com/FIXME.

## Usage

FIXME: explanation

    $ java -jar joy-0.1.0-standalone.jar [args]

## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bug

...

### Any Other Sections
### That You Think
### Might be Useful

## License

Copyright © 2021 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html. -->
