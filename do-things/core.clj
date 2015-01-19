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

