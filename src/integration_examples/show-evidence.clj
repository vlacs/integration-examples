(ns integration-examples.show-evidence
  (:require [clojure.data.json :as json]))

(defn edn->json [edn]
  (println (json/json-str edn)))

(def user-update
  [{:header {:operation :assert
             :entity-type :user
             :entity-id {:user-id 1234}}
    :payload {:entity {:lastname "Williams"}}}])

(def task-progress
  [{:header {:operation :assert
             :entity-type :task-progress
             :entity-id {:enrollment-id 2345 :task-id 3456}}
     :payload {:entity {:evaluator-id 9876 :status "complete"}}}])

(def task-progress-batch
  [{:header {:operation :assert
             :entity-type :task-progress
             :entity-id {:enrollment-id 2345 :task-id 3456}}
    :payload {:entity {:status "complete"}}}
   {:header {:operation :assert
             :entity-type :task-progress
             :entity-id {:enrollment-id 5678 :task-id 6789}}
    :payload {:entity {:evaluator-id 8765 :status "in-progress"}}}])


(def new-task
  [{:header {:operation :assert
             :entity-id {:task-id 17}
             :entity-type :task}
    :payload {:entity {:name "tie shoes (together)"
                       :version "v3"
                       :competency-parents [1 2 3]}}}])

