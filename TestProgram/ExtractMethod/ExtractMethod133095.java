class A{ 
 public static List<Boolean> getLociEnrichment(final InputQuery<BedTrackData> query,
                                                final GenomeQuery genomeQuery,
                                                final BINARIZATION binarization,
                                                final int binSize,
                                                final List<Location> locations) {
    final List<Boolean> bins = binarization.process(query, genomeQuery, binSize);
    final GenomeBins genomeBins = new GenomeBins(genomeQuery, binSize);
    return locations.stream().map(l -> {
      final Chromosome chromosome = l.getChromosome();
      final int offset = genomeBins.getOffset(chromosome);
      final int startOffset = offset + l.getStartOffset() / binSize;
      final int endOffset = offset + l.getEndOffset() / binSize;
      // compute max vote
      int positives = 0;
      for (int i = startOffset; i < endOffset; i++) {
        if (bins.get(i)) {
          positives++;
        }
      }
      return positives > (endOffset - startOffset) / 2;
    }).collect(Collectors.toList());
  }
}