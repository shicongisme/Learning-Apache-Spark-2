val data = sc.parallelize(List(("MyKey1","MyValue1"),("MyKey2","MyValue2"),("MyKey3","MyValue3")))

data.saveAsSequenceFile("/home/spark/sampledata/seq-example")