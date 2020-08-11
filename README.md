# gptools


## Overview
gptools is wrapper for google play link

## Usage
```
import jp.millennium.ncl.googleplaytools.searchOnPlayStore

val query = "aseasy"
searchOnPlayStore(query)
```

```
import jp.millennium.ncl.googleplaytools.appDetailOnPlayStore

val packageName = "jp.millennium.ncl.retrocalculator"
appDetailOnPlayStore(packageName)
```

```
import jp.millennium.ncl.googleplaytools.developerOnPlayStore

val developerId = "7318129576372072658"
developerOnPlayStore(developerId)
```

## Installation
```
dependencies {
	implementation 'jp.millennium.ncl.gptools:gptools:1.0.0'
}

repositories {
    maven { url 'http://raw.github.com/woshiyezu/gptools/master/repository/' }
}
```
## Author
Yezu Tanaka (田中葉子)

## License
gptools is available under the MIT license. See the LICENSE file for more info.
