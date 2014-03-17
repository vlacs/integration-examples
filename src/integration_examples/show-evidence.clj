(ns integration-examples.show-evidence
  (:require [clojure.data.json :as json]))

(defn edn->json [edn]
  (println (json/json-str edn)))

(def user-update
  {:header {:operation :assert :assertion-id 1234}
   :payload [{:entity-type :user
              :entity-id {:user-id 1234}
              :entity {:lastname "Williams"}}]})

(def task-progress
  {:header {:operation :assert :assertion-id 2345}
   :payload [{:entity-id {:enrollment-id 2345 :task-id 3456}
              :entity {:evaluator-id 9876 :status "complete"}}]})

(def task-progress-batch
  {:header {:operation :assert :assertion-id 3456}
   :payload [{:entity-id {:enrollment-id 2345 :task-id 3456}
              :entity {:status "complete"}}
             {:entity-id {:enrollment-id 5678 :task-id 6789}
              :entity {:evaluator-id 8765 :status "in-progress"}}]})

