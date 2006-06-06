package org.apache.maven.shared.io.location;

import org.apache.maven.artifact.Artifact;

public class ArtifactLocation
    extends FileBasedLocation
{

    public ArtifactLocation( Artifact artifact, String specification )
    {
        super( specification );
        setFile( artifact.getFile() );
    }

}