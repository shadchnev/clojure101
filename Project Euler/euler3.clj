(defn euler3 [lim]
  (defn iter [x]
    (cond (= (rem lim x) 0) x
          :else (iter (- x 1)))
  )
  (iter (- lim 1))
)

(euler3 600851475143) ; stack overflow :(
