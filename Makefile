NOTE = "None Note"
publish:
	git add .
	git commit -m "$(NOTE)"
	git push
	gitbook build
	git checkout gh-pages
	cp -r _book/* .
	git add .
	git commit -m "auto published in gh-pages branch"
	git push
	git checkout master