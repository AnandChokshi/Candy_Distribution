(defn candy-candy [] (def candy [(read) (read) (read)])                                        ;; Read data from user
 (def candy (conj candy 0))                                                                    
(loop [result [candy] i 1]                                                                     ;; Loop and recure for cheking wheater candy is even or not
(let [[c1 c2 c3] candy]                                                                        ;; destructureing of candy vector into c1 c2 c3
  (def x (+ (/ c1 2) (/ c3 2)))                                                                ;; Variable x = (first/2 + last/2)
  (def y (+ (/ c2 2) (/ c1 2)))                                                                ;; Variable y = (second/2 + first/2)
  (def z (+ (/ c3 2) (/ c2 2)))                                                                ;; Variable z = (last/2 + second/2)
      (if(odd? x) (def x (+ x 1))) (if(odd? y) (def y (+ y 1))) (if(odd? z) (def z (+ z 1))))  ;; Check wheather candy is odd or not, if odd add one
(def candy [x y z])                                                                            ;; generate new vector for manipulation in next turn
(if (= x y z) (print (conj result [x y z i]))                                                 ;; if to check wheather three student have same candy
  (recur (conj result [x y z i]) (inc i)))))                                                   ;; add current data to result so we can finally print result with all the records