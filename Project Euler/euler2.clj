(defn euler2 [lim]
  (defn iter [sum x1 x2]
    (cond (> x2 lim) sum
          (= 0 (rem x2 2)) (iter (+ sum x2) x2 (+ x1 x2))
          :else (iter sum x2 (+ x1 x2)))
  )
  (iter 0 1 2)
)

(euler2 4000000)
