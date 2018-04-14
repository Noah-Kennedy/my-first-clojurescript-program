(ns my-first-clojurescript-program.core
  (:require-macros [joy.macro-tunes :as mtunes]))

(enable-console-print!)

(println "Fuck yeah!")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
  )

(defn go []
  (js/alert "fuck you"))