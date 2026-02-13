package L9;

/* loaded from: classes2.dex */
public abstract class c extends Throwable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6423d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f6424a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6425b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f6426c;

    public c(int i7, String str, Throwable th) {
        super(str, th);
        this.f6424a = i7;
        this.f6425b = str;
        this.f6426c = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f6426c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f6425b;
    }
}
