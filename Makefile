publish:
	gitbook build
	git add .
	git commit -m "auto updated book contents"
	git push
	git checkout gh-pages
	git update
	git add .
	git commit -m "auto published"
	git push
	git checkout master