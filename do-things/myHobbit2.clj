

(def asym-parts [{:name "left-arm" :size 3} 
                 {:name "head" :size 5}
                 {:name "left-leg" :size 4}])

(defn needs-matching-part? [part]
  (re-find #"^left-" (:name part)))

(defn make-matching-part [part]
  {:name (clojure.string/replace (:name part) "left-" "right-") :size (:size part)})

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
    
