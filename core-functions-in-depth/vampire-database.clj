(def vampire-database
  {0 {:makes-blood-puns? false, :has-pulse? true, :name "McFishwich"}
   1 {:makes-blood-puns? false, :has-pulse? true, :name "McMackson"}
   2 {:makes-blood-puns? true,  :has-pulse? false, :name "Damon Salvatore"}
   3 {:makes-blood-puns? true,  :has-pulse? true, :name "Mickey Mouse"}}
)

(defn vampire-related-details
  [social-security-number]
  (Thread/sleep 1000)
  (get vampire-database social-security-number))

(defn vampire?
  [record]
  (and (:makes-blood-puns? record)
       (not (:has-pulse? record))))

(defn identify-vampire
  [social-security-numbers]
  (first (filter vampire?
                 (map vampire-related-details social-security-numbers))))

;(time (identify-vampire (range 0 1000)))
(println (identify-vampire (range 0 1000)))
