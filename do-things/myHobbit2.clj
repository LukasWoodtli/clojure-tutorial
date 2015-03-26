

(def asym-parts ["left-arm" "head" "left-leg"])

(defn needs-matching-part? [part]
  (re-find #"^left-" part))

(defn make-matching-part [part]
  (clojure.string/replace part "left-" "right-"))

(defn create-hobbit [asym-body-parts]
  (loop [asym-list asym-body-parts
         sym-parts [] ]
    (if (empty? asym-list) 
      sym-parts
      (let [[part & rest-parts] asym-list]
       (if (needs-matching-part? part)
         (recur rest-parts (conj  (conj sym-parts part) (make-matching-part part)))
         (recur rest-parts (conj sym-parts part))))))) 



(println (create-hobbit asym-parts))

    
