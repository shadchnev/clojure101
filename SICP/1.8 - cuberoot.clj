(defn crt [x] 
  (defn abs [x]
    (if (> x 0) x (- x)))
  (defn square [x] 
    (* x x))
  (defn good-enough? [guess]
    (< (abs (- (* guess guess guess) x)) 0.001)) 
  (defn improve [guess]
    (/ (+ (/ x 
             (square guess)) 
          (* 2 
             guess)) 
       3) ) 
  (defn crt-iter [guess]
    (if (good-enough? guess) 
      guess
      (crt-iter (improve guess)))) 
  (crt-iter 1.0))

(crt 125)