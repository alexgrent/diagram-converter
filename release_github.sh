VERSION=$(mvn help:evaluate -Dexpression=project.version -q -DforceStdout)
gh release create "$VERSION" --title "Version Update" --notes "New Version Release"
