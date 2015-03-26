

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
      (if (needs-matching-part? (first asym-list))
        (recur (rest asym-list) (conj  (conj sym-parts (first asym-list)) (make-matching-part (first asym-list))))
        (recur (rest asym-list) (conj sym-parts (first asym-list))))))) 



(println (create-hobbit asym-parts))

    
