(ns integration-examples.show-evidence
  (:require [clojure.data.json :as json]))

(defn user-update []
  (println (json/write-str
            {:header {:operation :assert}
             :payload [{:pheader {:entity-type :user}
                        :pdata {{:user-id 1234} {:lastname "Williams"}}}]})))

(defn task-progress []
  (println (json/write-str
            {:header {:operation :assert}
             :payload [{:pheader {:entity-type :task-progress}
                        :pdata {{:enrollment-id 2345 :task-id 3456}
                                {:evaluator-id 9876 :status "complete"}}}]})))

(defn task-progress-multi []
  (println (json/write-str
            {:header {:operation :assert}
             :payload [{:pheader {:entity-type :task-progress}
                        :pdata {{:enrollment-id 2345 :task-id 3456}
                                {:evaluator-id 9876 :status "complete"}
                                {:enrollment-id 5678 :task-id 6789}
                                {:evaluator-id 8765 :status "in-progress"}}}]})))

