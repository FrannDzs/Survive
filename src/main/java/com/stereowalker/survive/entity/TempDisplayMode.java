package com.stereowalker.survive.entity;

import com.stereowalker.unionlib.config.CommentedEnum;

public enum TempDisplayMode implements CommentedEnum<TempDisplayMode> {
	HOTBAR {
		@Override
		public String getComment() {
			return "Temperature Changes the color of your hotbar";
		}
	},
	NUMBERS {
		@Override
		public String getComment() {
			return "Temperature is drawn as number values on your screen";
		}
	},
	BAR {
		@Override
		public String getComment() {
			return "Temperature is drawn as a horizontal bar on your screen";
		}
	};

	

	@Override
	public TempDisplayMode[] getValues() {
		return values();
	}
}
