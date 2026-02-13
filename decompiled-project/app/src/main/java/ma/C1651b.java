package ma;

import a6.C0779c;
import android.os.Parcel;
import android.os.Parcelable;
import h3.o;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.l;

/* renamed from: ma.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1651b implements Parcelable {
    public static final Parcelable.Creator<C1651b> CREATOR = new C0779c(28);

    /* renamed from: a, reason: collision with root package name */
    public final f f20814a;

    /* renamed from: b, reason: collision with root package name */
    public final f f20815b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20816c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20817d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20818e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20819f;

    /* renamed from: u, reason: collision with root package name */
    public final EnumC1650a f20820u;

    /* renamed from: v, reason: collision with root package name */
    public final String f20821v;

    /* renamed from: w, reason: collision with root package name */
    public final String f20822w;

    public C1651b(f homeTeam, f awayTeam, String kickOffTime, long j, String statusStream, String detailPage, EnumC1650a sourceFrom, String league, String matchId) {
        l.e(homeTeam, "homeTeam");
        l.e(awayTeam, "awayTeam");
        l.e(kickOffTime, "kickOffTime");
        l.e(statusStream, "statusStream");
        l.e(detailPage, "detailPage");
        l.e(sourceFrom, "sourceFrom");
        l.e(league, "league");
        l.e(matchId, "matchId");
        this.f20814a = homeTeam;
        this.f20815b = awayTeam;
        this.f20816c = kickOffTime;
        this.f20817d = j;
        this.f20818e = statusStream;
        this.f20819f = detailPage;
        this.f20820u = sourceFrom;
        this.f20821v = league;
        this.f20822w = matchId;
    }

    public final String a() {
        return X.c.i(this.f20814a.f20830a, " - ", this.f20815b.f20830a);
    }

    public final boolean b() {
        long timeInMillis = Calendar.getInstance(Locale.TAIWAN).getTimeInMillis() / 1000;
        long j = this.f20817d;
        return timeInMillis - j > -1200 && timeInMillis - j < 9000;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FootballMatch(homeTeam=");
        sb2.append(this.f20814a);
        sb2.append(", awayTeam=");
        sb2.append(this.f20815b);
        sb2.append(", kickOffTime='");
        sb2.append(this.f20816c);
        sb2.append("', kickOffTimeInSecond=");
        sb2.append(this.f20817d);
        sb2.append(", statusStream='");
        sb2.append(this.f20818e);
        sb2.append("', detailPage='");
        sb2.append(this.f20819f);
        sb2.append("', sourceFrom=");
        sb2.append(this.f20820u);
        sb2.append(", league='");
        sb2.append(this.f20821v);
        sb2.append("', matchId='");
        return o.p(sb2, this.f20822w, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        l.e(dest, "dest");
        this.f20814a.writeToParcel(dest, i7);
        this.f20815b.writeToParcel(dest, i7);
        dest.writeString(this.f20816c);
        dest.writeLong(this.f20817d);
        dest.writeString(this.f20818e);
        dest.writeString(this.f20819f);
        dest.writeString(this.f20820u.name());
        dest.writeString(this.f20821v);
        dest.writeString(this.f20822w);
    }
}
