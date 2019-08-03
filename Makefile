publish:
	gitbook build
	git checkout gh-pages
	git update
	git add .
	git commit -m "auto published"
	git push
	git checkout master