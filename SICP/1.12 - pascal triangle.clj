(defn buildvector [v]
  (loop [i 1, res [1]] ; in any case, the result begins with 1
    (if (< i (count v)) 
      (recur (+ i 1) 
        (into res 
              [(+ (v (dec i)) 
                  (v i))]))
      (into res [1])))) ; in any case, the result ends with 1
          
(defn triangle [n]
  (if (= n 0)
    [1]
    (buildvector (triangle (- n 1)))
    ))
  
(triangle 5)