user=> (map inc (range 10))
(1 2 3 4 5 6 7 8 9 10)

user=> (map dec (range 10))
(-1 0 1 2 3 4 5 6 7 8)

user=> (mapv inc '(1 2 3))
[2 3 4]
user=> (map inc '(1 2 3))
(2 3 4)

user=> (map int "hello")
(104 101 108 108 111)

user=> (map char '(104 101 108 108 111))
(\h \e \l \l \o)
user=> (apply str (map char '(104 101 108 108 111)))
"hello"

user=> (map #(println % " => " (char %)) (range 128))

(format "%5d-%s" 123 "hello")
(format "%5d-%10s" 123 "hello")
(format "%-5d-%10s" 123 "hello")

user=> (re-find #"\d" "123")
"1"
user=> (re-find #"\d{2}" "123")
"12"
user=> (re-find #"\d+" "123")
"123"

user=> (re-seq #"\w+" "hello world")
("hello" "world")

user=> (re-seq #"\d+" "12 345 6789")
("12" "345" "6789")
user=> (re-seq #"\d" "12 345 6789")
("1" "2" "3" "4" "5" "6" "7" "8" "9")

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

user=> (dotimes [i 5] (prn i))
0
1
2
3
4
nil

user=> (into #{} (range 10))
#{0 7 1 4 6 3 2 9 5 8}
user=> (into (sorted-set) (range 10))
#{0 1 2 3 4 5 6 7 8 9}

user=> (every? #(Character/isLetter %) "hello")
true

user=> (first '(1 2 3))
1
user=> (second '(1 2 3))
2
user=> (first (next '(1 2 3)))
2
user=> (next '(1 2 3))
(2 3)
user=> (last '(1 2 3))
3

user=> (-> 10 (/ 5))
2
user=> (->> 10 (/ 5))
1/2
user=> (->> 10 (/ 5) (inc))
3/2
user=> (-> 10 (/ 5) (inc))
3

user=> (disj #{:a :b :c} :a)
#{:c :b}
user=> (disj #{:a :b :c} :a :b)
#{:c}

user=> (type {})
clojure.lang.PersistentArrayMap
user=> (type #{})
clojure.lang.PersistentHashSet

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

user=> (clojure.string/split "hello world" #"\s+")
["hello" "world"]

clojure.string/split-lines
clojure.string/starts-with?
clojure.string/trim
clojure.string/trim-newline
clojure.string/triml
clojure.string/trimr
clojure.string/upper-case

Math/E
Math/IEEEremainder
Math/PI

user=> (Math/E)
2.718281828459045
user=> (Math/PI)
3.141592653589793

Math/abs
Math/acos
Math/addExact
Math/asin
Math/atan
Math/atan2
Math/cbrt
Math/ceil
Math/copySign
Math/cos
Math/cosh
Math/decrementExact
Math/exp
Math/expm1
Math/floor

user=> (Math/floor 12.3)
12.0

Math/floorDiv
Math/floorMod
Math/getExponent
Math/hypot
Math/incrementExact
Math/log
Math/log10
Math/log1p
Math/max
Math/min
Math/multiplyExact
Math/negateExact
Math/negativeZeroDoubleBits
Math/negativeZeroFloatBits
Math/nextAfter
Math/nextDown
Math/nextUp
Math/pow

user=> (Math/pow 2 3)
8.0

Math/random
Math/rint
Math/round
Math/scalb
Math/signum
Math/sin
Math/sinh
Math/sqrt
Math/subtractExact
Math/tan
Math/tanh
Math/toDegrees
Math/toIntExact
Math/toRadians
Math/twoToTheDoubleScaleDown
Math/twoToTheDoubleScaleUp
Math/ulp

user=> (shuffle (range 10))
[3 8 2 4 1 5 9 0 6 7]



Integer/BYTES
Integer/DigitOnes
Integer/DigitTens
Integer/MAX_VALUE

user=> Integer/MAX_VALUE
2147483647

Integer/MIN_VALUE

user=> Integer/MIN_VALUE
-2147483648

Integer/SIZE
Integer/TYPE
Integer/bitCount
Integer/compare
Integer/compareUnsigned
Integer/decode
Integer/digits
Integer/divideUnsigned
Integer/getInteger
Integer/hashCode
Integer/highestOneBit
Integer/lowestOneBit
Integer/max
Integer/min
Integer/numberOfLeadingZeros
Integer/numberOfTrailingZeros
Integer/parseInt
Integer/parseUnsignedInt
Integer/remainderUnsigned
Integer/reverse
Integer/reverseBytes
Integer/rotateLeft
Integer/rotateRight
Integer/serialVersionUID
Integer/signum
Integer/sizeTable
Integer/sum
Integer/toBinaryString
Integer/toHexString
Integer/toOctalString
Integer/toString
Integer/toUnsignedLong
Integer/toUnsignedString
Integer/valueOf

user=> (time (reduce + (range 101)))
"Elapsed time: 0.097959 msecs"
5050

user=> (def add-by-two (partial + 2))
#'user/add-by-two

lein new proj
tree proj
proj
├── CHANGELOG.md
├── LICENSE
├── README.md
├── doc
│   └── intro.md
├── project.clj
├── resources
├── src
│   └── proj
│       └── core.clj
└── test
    └── proj
        └── core_test.clj

