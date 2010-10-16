(defn euler1 [lim]
  (defn multiple? [x]
    (or (= 0 (rem x 3)) (= 0 (rem x 5))))  
  (defn iter [sum x]
    (cond (= x lim) sum
          (multiple? x) (iter (+ sum x) (+ x 1))
          :else (iter sum (+ x 1)))
  )
  (iter 0 0)
)

(euler1 1000)
