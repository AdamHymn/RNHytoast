
# react-native-hytoast

## Getting started

`$ npm install react-native-hytoast --save`

### Mostly automatic installation

`$ react-native link react-native-hytoast`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-hytoast` and add `RNHytoast.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNHytoast.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.hymn.toast.RNHytoastPackage;` to the imports at the top of the file
  - Add `new RNHytoastPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-hytoast'
  	project(':react-native-hytoast').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-hytoast/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-hytoast')
  	```


## Usage
```javascript
import RNHytoast from 'react-native-hytoast';

// TODO: What to do with the module?
RNHytoast;
```
  