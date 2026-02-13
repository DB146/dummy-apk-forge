package H2;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4664a;

    /* renamed from: b, reason: collision with root package name */
    public int f4665b;

    /* renamed from: c, reason: collision with root package name */
    public int f4666c;

    /* renamed from: d, reason: collision with root package name */
    public int f4667d;

    /* renamed from: e, reason: collision with root package name */
    public int f4668e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4669f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4670h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4671i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f4672l;

    /* renamed from: m, reason: collision with root package name */
    public long f4673m;

    /* renamed from: n, reason: collision with root package name */
    public int f4674n;

    /* renamed from: o, reason: collision with root package name */
    public int f4675o;

    /* renamed from: p, reason: collision with root package name */
    public int f4676p;

    public final void a(int i7) {
        if ((this.f4667d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.f4667d));
    }

    public final int b() {
        return this.g ? this.f4665b - this.f4666c : this.f4668e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f4664a + ", mData=null, mItemCount=" + this.f4668e + ", mIsMeasuring=" + this.f4671i + ", mPreviousLayoutItemCount=" + this.f4665b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4666c + ", mStructureChanged=" + this.f4669f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.k + '}';
    }
}
