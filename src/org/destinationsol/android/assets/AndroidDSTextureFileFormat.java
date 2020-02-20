/*
 * Copyright 2018 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.destinationsol.android.assets;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import org.destinationsol.assets.textures.DSTextureData;
import org.terasology.gestalt.assets.ResourceUrn;
import org.terasology.gestalt.assets.format.AbstractAssetFileFormat;
import org.terasology.gestalt.assets.format.AssetDataFile;

import java.util.List;

public class AndroidDSTextureFileFormat extends AbstractAssetFileFormat<DSTextureData> {
    public AndroidDSTextureFileFormat() {
        super("png");
    }

    @Override
    public DSTextureData load(ResourceUrn urn, List<AssetDataFile> inputs) {
        FileHandle handle = new AndroidAssetDataFileHandle(inputs.get(0));
        Texture texture = new Texture(handle);
        return new DSTextureData(texture);
    }
}
