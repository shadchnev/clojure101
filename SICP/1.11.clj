(defn recursive [n]
  (if (< n 3) n
     (+ (recursive (- n 1))
       (* 2 (recursive (- n 2)))
       (* 3 (recursive (- n 3))))))
       
       
(defn iterative [n]
  (defn iter [i s0 s1 s2]
    (def s (+ s2 (* 2 s1) (* 3 s0)))
    (if (= i n)
      s
      (iter (+ i 1) s1 s2 s)))
  (if (< n 3)
    n
    (iter 3 0 1 2))
)

(recursive 10)       
(iterative 10)
