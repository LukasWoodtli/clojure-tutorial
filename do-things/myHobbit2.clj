

(def asym-hobbit-body-parts [{:name "head" :size 3}
                             {:name "left-eye" :size 1}
                             {:name "left-ear" :size 1}
                             {:name "mouth" :size 1}
                             {:name "nose" :size 1}
                             {:name "neck" :size 2}
                             {:name "left-shoulder" :size 3}
                             {:name "left-upper-arm" :size 3}
                             {:name "chest" :size 10}
                             {:name "back" :size 10}
                             {:name "left-forearm" :size 3}
                             {:name "abdomen" :size 6}
                             {:name "left-kidney" :size 1}
                             {:name "left-hand" :size 2}
                             {:name "left-knee" :size 2}
                             {:name "left-thigh" :size 4}
                             {:name "left-lower-leg" :size 3}
                             {:name "left-achilles" :size 1}
                             {:name "left-foot" :size 2}])

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




(println (create-hobbit asym-hobbit-body-parts))
    
