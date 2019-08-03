publish:
	gitbook build
	git checkout gh-pages
	git update