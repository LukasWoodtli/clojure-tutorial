(def asym-hobbit-body-parts [{:name "head"} 
                             {:name "left-eye"} 
                             {:name "left-ear"}])

(defn needs-matching-part [part]
  (re-find #"left-" part))

(defn symetrize-parts [parts]
  (loop [[part & rest] parts
         new-parts []]
    (if (empty? part)
      new-parts
      (recur rest (conj new-parts part)))))

(println (symetrize-parts asym-hobbit-body-parts))


    
    
