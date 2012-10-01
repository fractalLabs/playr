(ns playr.modules)


(defn apt [x]
   (if (list? x)
      {:name "Install various packages"
       :action "apt pkg=$item state=installed"
       :with-items x}
      {:name (str "Install " x)
       :action (str "apt pkg=" x " state=installed")}))

(defn copy [orig dest]
   {:name (str "copy " orig " to " dest)})

(defn git [repo location]
   {:name (str "Pull " repo)
    :action (str "git repo=" repo " dest=" location " version=master")})


