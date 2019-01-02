user=> (map inc (range 10))
(1 2 3 4 5 6 7 8 9 10)

user=> (map dec (range 10))
(-1 0 1 2 3 4 5 6 7 8)

user=> (map int "hello")
(104 101 108 108 111)

user=> (map char '(104 101 108 108 111))
(\h \e \l \l \o)
user=> (apply str (map char '(104 101 108 108 111)))
"hello"

user=> (map #(println % " => " (char %)) (range 128))

user=> (defn sum [i j] (+ i j))
#'user/sum
user=> (reduce sum (range 101))
5050

user=> (apply str (range 10))
"0123456789"

user=> (interpose "#" (range 10))
(0 "#" 1 "#" 2 "#" 3 "#" 4 "#" 5 "#" 6 "#" 7 "#" 8 "#" 9)

user=> (.toUpperCase "abcde")
"ABCDE"

user=> (seq "hello")
(\h \e \l \l \o)

user=> (frequencies "hello")
{\h 1, \e 1, \l 2, \o 1}

user=> (every? #(Character/isLetter %) "hello")
true



clojure.string/blank?
clojure.string/capitalize
clojure.string/ends-with?
clojure.string/escape
clojure.string/includes?
clojure.string/index-of
clojure.string/join
clojure.string/last-index-of
clojure.string/lower-case
clojure.string/re-quote-replacement
clojure.string/replace
clojure.string/replace-first
clojure.string/reverse
clojure.string/split
clojure.string/split-lines
clojure.string/starts-with?
clojure.string/trim
clojure.string/trim-newline
clojure.string/triml
clojure.string/trimr
clojure.string/upper-case
