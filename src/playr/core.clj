(ns playr.core
   (:use playr.modules)
   (:require [clj-yaml.core :as yaml]))



(defn boilerplate [s]
   (str "---\n" s))

(defn pb [headers tasks]
   (println (boilerplate (yaml/generate-string (assoc headers :tasks (list tasks))))))

