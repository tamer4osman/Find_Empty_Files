private Set<Path> findEmpty(Set<Path> sourceFiles) {
        Set<Path> EmptyFiles = new HashSet<>();
        sourceFiles.forEach(path ->
        {
            if (path.toFile().length() == 0)
                EmptyFiles.add(path);
        });
        return EmptyFiles;
    }
