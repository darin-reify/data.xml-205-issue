(ns repo
  (:require [clojure.data.xml :as xml]
            [clojure.pprint :as pprint])
  (:import [java.io ByteArrayInputStream]))

(def input "<bar xmlns=\"https://sts.amazonaws.com/doc/2011-06-15/\"><foo>hello, world</foo></bar>")

(defn pprint [_opts]
  (-> ^String input
      (.getBytes "UTF-8")
      (ByteArrayInputStream.)
      (xml/parse :namespace-aware false
                 :skip-whitespace true)
      (pprint/pprint)))
