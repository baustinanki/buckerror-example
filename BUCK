android_prebuilt_aar(
  name = 'android-support-v4-23',
  aar = 'support-v4-23.0.1.aar',
)

android_library(
  name = 'foo_lib',
  srcs = glob(['**/*.java']),
  deps = [':android-support-v4-23'],
)

android_aar(
  name = 'foo',
  manifest_skeleton = 'AndroidManifest.xml',
  deps = [':foo_lib'],
  visibility = ['PUBLIC'],
)
