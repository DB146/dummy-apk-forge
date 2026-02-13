package k6;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: k6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1432c extends A4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19026c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f19027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1432c(CarouselLayoutManager carouselLayoutManager, int i7) {
        super(1, 3);
        this.f19026c = i7;
        switch (i7) {
            case 1:
                this.f19027d = carouselLayoutManager;
                super(0, 3);
                return;
            default:
                this.f19027d = carouselLayoutManager;
                return;
        }
    }

    @Override // A4.c
    public final int r() {
        switch (this.f19026c) {
            case 0:
                return this.f19027d.f13718o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f19027d;
                return carouselLayoutManager.f13718o - carouselLayoutManager.K();
        }
    }

    @Override // A4.c
    public final int t() {
        switch (this.f19026c) {
            case 0:
                return this.f19027d.L();
            default:
                return 0;
        }
    }

    @Override // A4.c
    public final int u() {
        switch (this.f19026c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f19027d;
                return carouselLayoutManager.f13717n - carouselLayoutManager.M();
            default:
                return this.f19027d.f13717n;
        }
    }

    @Override // A4.c
    public final int v() {
        switch (this.f19026c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f19027d;
                if (carouselLayoutManager.X0()) {
                    return carouselLayoutManager.f13717n;
                }
                return 0;
        }
    }

    @Override // A4.c
    public final int y() {
        switch (this.f19026c) {
            case 0:
                return 0;
            default:
                return this.f19027d.N();
        }
    }
}
