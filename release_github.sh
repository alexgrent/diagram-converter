VERSION=$(mvn help:evaluate -Dexpression=project.version -q -DforceStdout)

# Create a Git tag with the version
git tag -a "$VERSION" -m "Release $VERSION"

# Push the tag to the remote repository
git push origin "$VERSION"

# Create a GitHub release with the version tag
gh release create "$VERSION" --title "Version Update" --notes "New Version Release"
