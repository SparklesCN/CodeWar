publish:
	gitbook build
	git checkout gh-pages
	make update
	git add .
	git commit -m "auto published"
	git push