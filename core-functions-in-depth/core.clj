(identity "abc")

(map identity {:name "Bill Compton" :occupation "Dead mopey guy"})


(map inc [0 1 2])

(map str ["a" "b" "c"] ["A" "B" "C"] [1 2 3])


(def human-consumption [8.1 7.3 6.6 5.0])
(def critter-consumption [0.0 0.2 0.3 1.1])
(defn unify-diet-data [first second]
  {:human first :critter second})

(println  (map unify-diet-data human-consumption critter-consumption))


; map: pass a collection of functions
(def sum #(reduce + %))
(def avg #(/ (sum %) (count %)))
(defn stats [numbers]
  (map #(% numbers) [sum count avg]))

(stats [3 4 10])
(stats [80 1 44 13 6])
