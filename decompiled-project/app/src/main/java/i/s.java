package i;

import B0.AbstractC0169c;
import a.AbstractC0672a;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0169c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18091c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f18092d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, Q7.h hVar) {
        super(vVar);
        this.f18092d = vVar;
        this.f18093e = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, Context context) {
        super(vVar);
        this.f18092d = vVar;
        this.f18093e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // B0.AbstractC0169c
    public final IntentFilter d() {
        switch (this.f18091c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, i.D] */
    @Override // B0.AbstractC0169c
    public final int f() {
        Location location;
        boolean z8;
        long j;
        Location location2;
        switch (this.f18091c) {
            case 0:
                return o.a((PowerManager) this.f18093e) ? 2 : 1;
            default:
                Q7.h hVar = (Q7.h) this.f18093e;
                M9.i iVar = (M9.i) hVar.f8697d;
                if (iVar.f6871b > System.currentTimeMillis()) {
                    z8 = iVar.f6870a;
                } else {
                    Context context = (Context) hVar.f8695b;
                    int e2 = AbstractC0672a.e(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) hVar.f8696c;
                    if (e2 == 0) {
                        try {
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (AbstractC0672a.e(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e11) {
                            Log.d("TwilightManager", "Failed to get last known location", e11);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (D.f17990d == null) {
                            D.f17990d = new Object();
                        }
                        D d10 = D.f17990d;
                        d10.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        d10.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z8 = d10.f17993c == 1;
                        long j10 = d10.f17992b;
                        long j11 = d10.f17991a;
                        d10.a(location.getLatitude(), location.getLongitude(), 86400000 + currentTimeMillis);
                        long j12 = d10.f17992b;
                        if (j10 == -1 || j11 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j11) {
                                j12 = currentTimeMillis > j10 ? j11 : j10;
                            }
                            j = j12 + 60000;
                        }
                        iVar.f6870a = z8;
                        iVar.f6871b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i7 = Calendar.getInstance().get(11);
                        if (i7 < 6 || i7 >= 22) {
                            z8 = true;
                        }
                    }
                }
                return z8 ? 2 : 1;
        }
    }

    @Override // B0.AbstractC0169c
    public final void j() {
        switch (this.f18091c) {
            case 0:
                this.f18092d.m(true, true);
                return;
            default:
                this.f18092d.m(true, true);
                return;
        }
    }
}
