publish:
	gitbook build
	git checkout gh-pages
	make update
	git add .
	git commit -m "auto published"
	git push
	git checkout master

update:
	cp -r _book/* .
