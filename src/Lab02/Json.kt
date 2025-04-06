package Lab02

// Cho phép lớp được đánh dấu chuyển đổi sang Json
@Target(AnnotationTarget.CLASS, AnnotationTarget.TYPE)
// Chỉ định kiểu anno có được lưu trữ trong runtime hay không
@Retention(AnnotationRetention.RUNTIME)
annotation class Json()
