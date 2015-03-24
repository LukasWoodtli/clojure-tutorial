(def asym-hobbit-body-parts [{:name "head" :size 5} 
                             {:name "left-eye" :size 2} 
                             {:name "left-ear" :size 1}])

(defn needs-matching-part?
  [part]
  (re-find #"left-" (:name part)))

(defn make-matching-part
  [part]
  {:name (clojure.string/replace (:name part) #"^left-" "right-") :size (:size part)})

(defn symetrize-parts 
  "blabla"
  [asym-body-parts] 
  (loop [remaining-asym-parts asym-body-parts
         final-body-parts []]
    (if (empty? remaining-asym-parts)
      final-body-parts
      (if (needs-matching-part? (first remaining-asym-parts))
        (recur (rest remaining-asym-parts) (conj final-body-parts (make-matching-part (first remaining-asym-parts)))) 
        (recur (rest remaining-asym-parts) remaining-asym-parts)))))


(println (symetrize-parts asym-hobbit-body-parts))



    
    
