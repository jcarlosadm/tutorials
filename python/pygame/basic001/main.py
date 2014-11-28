#!/usr/bin/python

import pygame
from pygame.locals import *

def main():

    # initialize screen
    pygame.init()
    # set dimensions of screen
    screen = pygame.display.set_mode((350,150))
    # window title
    pygame.display.set_caption('Basic Pygame program')
    
    # surface pygame (background)
    background = pygame.Surface(screen.get_size())
    background = background.convert()
    # fill surface
    background.fill((250, 250, 250))
    
    # get font
    font = pygame.font.Font(None, 36)
    # render font
    text = font.render("Hello there", 1, (10, 10, 10))
    # get rect
    textpos = text.get_rect()
    # font position
    textpos.centerx = background.get_rect().centerx
    # include text in background
    background.blit(text, textpos)
    
    # add background to screen
    screen.blit(background, (0, 0))
    # flip
    pygame.display.flip()
    
    while 1:
        for event in pygame.event.get():
            # if quit, end fo program
            if event.type == QUIT:
                return
        # update screen
        screen.blit(background, (0, 0))
        pygame.display.flip()

# initialize game
main()
