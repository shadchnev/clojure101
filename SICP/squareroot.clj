(defn sqrt [x] 
  (defn abs [x]
    (if (> x 0) x (- x)))
  (defn square [x] 
    (* x x))
  (defn average [x y]
    (/ (+ x y) 2))
  (defn good-enough? [guess]
    (< (abs (- (square guess) x)) 0.001)) 
  (defn improve [guess]
    (average guess (/ x guess))) 
  (defn sqrt-iter [guess]
    (if (good-enough? guess) 
      guess
      (sqrt-iter (improve guess)))) 
  (sqrt-iter 1.0))

(sqrt 100)