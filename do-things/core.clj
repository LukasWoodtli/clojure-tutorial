(if false
  "hokus pokus"
  "abra kadabra")

(if false
  (do (println "abc")
      "hokus pokus")
  (do (println "def")
      "aba kadabra")
)


(when true
  (println "abc")
  "abra kadabra"
  "blabla")

(= "abc" "abc" "abc") ;; true

;; look up :a in map
(:a {:a 1 :b 2 :c 3})

;; This is equivalent
(get {:a 1 :b 2 :c 3} :a)

;;  Default value
(:d {:a 1 :b 2 :c 3} "UNICORN")

(get {:a 1 :b 2 :c 3} :d "UNICORN2")


;; create hash map
(hash-map :a1 :b2)

;; create vector
(vector "creepy" "full" "moon")
;; same as
["creepy" "full" "moon"]

;; Add element to vector
(conj [1 2 3] 4)


;; create lists
(list 1 2 3 4)
;; same as
'(1 2 3 4)

;; Elements get added to the beginning of the list
(conj '(1 2 3 4) 0) ;; (0 1 2 3 4)

(first '(1 2 3 4))
(second '(1 2 3 4))
(rest '(1 2 3 4))


((or + -) 1 2 3)


(inc 1.1)

(map inc [0 1 2 3])


;; Clojure evaluates all function arguments recursively before passing them to the function
(+ (inc 199) (/ 100 (- 7 2)))
(+ (inc 199) (/ 100 5))
(+ 200 20)
220


;; Overloading function by arg nmb with multiple-arity
(defn x-chop 
  "Describe the kind of chop you're inflicting on someone"
  ([name chop-type]
   (str "I " chop-type " chop " name "! Take that!"))
  ([name]
   (x-chop name "karate")))

(x-chop "Kayne West" "slap")

(x-chop "Kayne West")




;; Rest parameter: the ampersand indicates the "rest-param"
(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn, " whippersnapper "!!!"))
(defn codger 
 [& whippersnappers] ;; the ampersand indicates the "rest-param"
 (map codger-communication whippersnappers))
(codger "Billy" "Anne Marie" "The Incredible Bulk")



;; Destructuring: bind symbols to values within a collection
(defn chooser
  [[first-choice second-choice & unimportant-choices]]
  (println (str "Your first choice is: " first-choice))
  (println (str "Your second choice is: " second-choice))
  (println (str "The rest: " (clojure.string/join ", " unimportant-choices)))
)
(chooser ["Marmalade", "Handsom Jack", "Pigpen", "Aquaman", "Blabla"])


;; let
(let  [x 3] x)
(def x 0)
(let [x 1] x) ; =>1 
(println x) ; =>0

;; Reference existing bindings in let
(def x 0)
(let [y (inc x)] y) ; =>1
(let [x (inc x)] x) ; =>1
(println x)

(def dalmatians-list
  ["Pongo" "Perdita" "Puppy 1" "Puppy 2"]) ;; and 97 more...
(let [dalmatians (take 2 dalmatians-list)] dalmatians)
;; rest-params in let
(let [[pongo & dalmatians] dalmatians-list]
  [pongo dalmatians]) ;; => ["Pongo" ("Perdita" "Puppy 1" "Puppy 2")]




