package J9;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class j extends i {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f5764E;

    /* renamed from: D, reason: collision with root package name */
    public long f5765D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5764E = sparseIntArray;
        sparseIntArray.put(R.id.browse_grid_dock, 1);
        sparseIntArray.put(R.id.info_container, 2);
        sparseIntArray.put(R.id.info, 3);
        sparseIntArray.put(R.id.playback_title, 4);
        sparseIntArray.put(R.id.playback_info, 5);
        sparseIntArray.put(R.id.playback_live_container, 6);
        sparseIntArray.put(R.id.playback_live, 7);
        sparseIntArray.put(R.id.playback_live_program_duration, 8);
        sparseIntArray.put(R.id.progress_bar_container, 9);
        sparseIntArray.put(R.id.video_progress_bar, 10);
        sparseIntArray.put(R.id.content_position, 11);
        sparseIntArray.put(R.id.content_duration, 12);
        sparseIntArray.put(R.id.center_controls_container, 13);
        sparseIntArray.put(R.id.btn_voice, 14);
        sparseIntArray.put(R.id.ic_play_pause, 15);
        sparseIntArray.put(R.id.btn_favourite, 16);
        sparseIntArray.put(R.id.btn_program_list, 17);
        sparseIntArray.put(R.id.btn_video_codec_info, 18);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f5765D = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f5765D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f5765D = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
