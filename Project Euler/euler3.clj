; adapted from http://grok-code.com/367/learning-clojure-with-project-euler/
(defn factor [num cur]
  (loop [num num, cur cur]
    (if (= num cur)
      num
      (if (zero? (rem num cur))
        (recur (/ num cur) cur)
        (recur num (+ cur 2))))))
(factor 600851475143 3)